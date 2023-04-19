android {
    namespace = "pro.schmid.renovate"

    defaultConfig {
        buildConfigField("boolean", "MY_VALUE", "true")
    }
    
    buildTypes {
        getByName("release") {
            buildConfigField("boolean", "MY_VALUE", "false")
        }
    }
}
