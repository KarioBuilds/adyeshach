package ink.ptms.adyeshach.common.entity.type

import ink.ptms.adyeshach.api.nms.NMS
import ink.ptms.adyeshach.common.entity.EntityInstance
import ink.ptms.adyeshach.common.entity.EntityTypes
import net.minecraft.server.v1_16_R1.EntityFireball
import org.bukkit.Location
import org.bukkit.craftbukkit.v1_16_R1.entity.CraftDragonFireball
import org.bukkit.entity.Player
import java.util.*

/**
 * @Author sky
 * @Since 2020-08-04 18:28
 */
open class AdyEntity(entityTypes: EntityTypes) : EntityInstance(entityTypes) {

    override fun visible(viewer: Player, visible: Boolean) {
        if (visible) {
            spawn(viewer) {
                NMS.INSTANCE.spawnEntity(viewer, entityType.getEntityTypeNMS(), index, UUID.randomUUID(), getLatestLocation().run {
                    if (this is EntityFireball) {
                        yaw = 0f
                        pitch = 0f
                    }
                    this
                })
            }
        } else {
            destroy(viewer) {
                NMS.INSTANCE.destroyEntity(viewer, index)
            }
        }
    }
}