dependencies {
    compileOnly("ink.ptms.core:v12002:12002:mapped")
    compileOnly("ink.ptms.core:v10900:10900")
    compileOnly("ink.ptms.core:v11903:11903:mapped")
    compileOnly("ink.ptms.core:v11903:11903:universal")
    compileOnly(project(":project:common"))
}

taboolib { subproject = true }