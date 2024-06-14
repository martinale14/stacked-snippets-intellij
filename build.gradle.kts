plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.23"
    id("org.jetbrains.intellij") version "1.17.3"
}

group = "com.github.martinale14.stackedsnippetsintellij"
version = "1.0"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2023.2.6")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf("android"))
}

tasks {
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "17"
        targetCompatibility = "17"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    patchPluginXml {
        sinceBuild.set("232")
        untilBuild.set("242.*")
    }

    signPlugin {
        certificateChain.set("-----BEGIN CERTIFICATE-----\n" +
                "MIIGHTCCBAWgAwIBAgIUSJ8yEM89XAWkDu1euf9M7BGeB2UwDQYJKoZIhvcNAQEL\n" +
                "BQAwgZ0xCzAJBgNVBAYTAkNPMRgwFgYDVQQIDA9WYWxsZSBkZWwgQ2F1Y2ExEDAO\n" +
                "BgNVBAcMB1BhbG1pcmExFDASBgNVBAoMC21hcnRpbmFsZTE0MRMwEQYDVQQLDApU\n" +
                "ZWNobm9sb2d5MQ8wDQYDVQQDDAZNYXJ0aW4xJjAkBgkqhkiG9w0BCQEWF21hcnRp\n" +
                "bmFsZTE0MDFAZ21haWwuY29tMB4XDTI0MDYxNDAwNDE0OVoXDTI1MDYxNDAwNDE0\n" +
                "OVowgZ0xCzAJBgNVBAYTAkNPMRgwFgYDVQQIDA9WYWxsZSBkZWwgQ2F1Y2ExEDAO\n" +
                "BgNVBAcMB1BhbG1pcmExFDASBgNVBAoMC21hcnRpbmFsZTE0MRMwEQYDVQQLDApU\n" +
                "ZWNobm9sb2d5MQ8wDQYDVQQDDAZNYXJ0aW4xJjAkBgkqhkiG9w0BCQEWF21hcnRp\n" +
                "bmFsZTE0MDFAZ21haWwuY29tMIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKC\n" +
                "AgEA3Ga6Qcy+7jsk56Dx3Rwu8QaRsyCLyo3Dyv+eMtd5m4t+7qXGqTYaKs0hHdwu\n" +
                "MMVSKVrZ+7I3+f1wVMbUfWgwawLkYJzS077iJ6iBaY/2Lxlwqo1dzf5OaU5Rk3Za\n" +
                "qlJFbpql7Pubdmusfn7DgG1Cb7kWkf4kEzSnvrx+bRa+RQFkr2poDjCiEBdkbDV3\n" +
                "x7cBFBWOwiV0tEhA/dVTDdtkDbkxVIjctJgxn5mitrMLDRPFDiHiMjizihTfoiJG\n" +
                "K6xVq8YpeMbY6gA8xqKOUzEqF4WGkK+tZ2R9kqUJEKEf2l9OJrP3VSxJFQH5fRlI\n" +
                "96mYRoeuv7HI0XpSjnWNTo5IV2lFj1RohRCo/1BXSLzSnU4dQhuJ9MqMWianNb97\n" +
                "0hwft7bKx4sN/kYJjIAzkl6OyZju3OxklUuxMfJSb3rOg4RIBMZAIEdQtwQZUsqn\n" +
                "C4DTUlZKVT2rxtfK+ekEGB+O2WnV0Fe4ufDkBxSznmIP2Trerbzop+yIRkgAXyH+\n" +
                "tU9wSzpnhuPDYXl6mQWEP2Yob5r2HtOmmNUarp/YmoQ3RhMR3q3F514LczYuHuaf\n" +
                "OTUgXXYmtX4776pXsyLzBpufLUOC1j6h1tMusOXRnW6e8ltOxxsAW49iawII3065\n" +
                "j5YVj+uxii/adbrOdnpbnrOD1Uv88dN0mTKYnIUJA/UE1JsCAwEAAaNTMFEwHQYD\n" +
                "VR0OBBYEFPPfRve53jBlIclOxnaM2X35GjfMMB8GA1UdIwQYMBaAFPPfRve53jBl\n" +
                "IclOxnaM2X35GjfMMA8GA1UdEwEB/wQFMAMBAf8wDQYJKoZIhvcNAQELBQADggIB\n" +
                "ALYCya31jfcnEBxYC/PBpibjOt3nmT0cVNjvZ7bDlx6SztWn3rJ250ADrI02cP0s\n" +
                "YfW/LIR2/D0YaVopAjdE0bDWG4X6Vl7yV0kiqaIyKJCr/ZJm8mch74s4zPNsH9no\n" +
                "dDX7wWNxy7+MXRZAnkyXSGL9Cs35uzUyrwCzVfmPFqdFaxQ7P3tumkPOf4yNEZFz\n" +
                "sGEyCj0hPSwY3E+HSGLOwc/nxE7YHehNDJ+uBMdB4pPUT7qkYrtG/XcxzAKWnfK2\n" +
                "jtmcdZaGEXD2IDs4khQ4tM5AIkKryUaNXAbKJvV8HSzkJZxCnM7ai1HHayYn6guH\n" +
                "DKdAHVHW6ZSmVAFoW5RDPAAPXA++8T7FMCWIqjzU7xekR14cU6Z/Z0JsaaO9RbCn\n" +
                "VzcUPo7G9TVQCqL7Yj0Rdq0rNlAVVvc4BGiHTu/foHTt+TGVIMtMDUdzv9NeiCDH\n" +
                "bM09YYscXO0E6P0YD+CLhExZPAMWPoRfHTxppe4B27jqrtD+INFHNyntp8llg61i\n" +
                "Y9RpBt8U3gw/ZpeDTqfU59Cnp9EDoxyVxrzHA6ZhcHhm5++qopku4YwLdKbHtltf\n" +
                "b8xnSrRfwj25ero/f2h8u82ED306Li20trrInbZleRdIJVZHEr+lWs0zvBFC1fe/\n" +
                "nI9mJTPyvjUIHtThKyJNGlT/j2f7uS3lOrQFz9mCc7/M\n" +
                "-----END CERTIFICATE-----")
        privateKey.set("-----BEGIN PRIVATE KEY-----\n" +
                "MIIJQwIBADANBgkqhkiG9w0BAQEFAASCCS0wggkpAgEAAoICAQDcZrpBzL7uOyTn\n" +
                "oPHdHC7xBpGzIIvKjcPK/54y13mbi37upcapNhoqzSEd3C4wxVIpWtn7sjf5/XBU\n" +
                "xtR9aDBrAuRgnNLTvuInqIFpj/YvGXCqjV3N/k5pTlGTdlqqUkVumqXs+5t2a6x+\n" +
                "fsOAbUJvuRaR/iQTNKe+vH5tFr5FAWSvamgOMKIQF2RsNXfHtwEUFY7CJXS0SED9\n" +
                "1VMN22QNuTFUiNy0mDGfmaK2swsNE8UOIeIyOLOKFN+iIkYrrFWrxil4xtjqADzG\n" +
                "oo5TMSoXhYaQr61nZH2SpQkQoR/aX04ms/dVLEkVAfl9GUj3qZhGh66/scjRelKO\n" +
                "dY1OjkhXaUWPVGiFEKj/UFdIvNKdTh1CG4n0yoxaJqc1v3vSHB+3tsrHiw3+RgmM\n" +
                "gDOSXo7JmO7c7GSVS7Ex8lJves6DhEgExkAgR1C3BBlSyqcLgNNSVkpVPavG18r5\n" +
                "6QQYH47ZadXQV7i58OQHFLOeYg/ZOt6tvOin7IhGSABfIf61T3BLOmeG48NheXqZ\n" +
                "BYQ/ZihvmvYe06aY1Rqun9iahDdGExHercXnXgtzNi4e5p85NSBddia1fjvvqlez\n" +
                "IvMGm58tQ4LWPqHW0y6w5dGdbp7yW07HGwBbj2JrAgjfTrmPlhWP67GKL9p1us52\n" +
                "elues4PVS/zx03SZMpichQkD9QTUmwIDAQABAoICAAc2zuraLjNO+PPNS/TZa2C5\n" +
                "NmOIyz/o5sxU0CJVfX1x9C7unPnaHjoU0skCKJPTKRQKHmCWwlCPDum+7wCtK15p\n" +
                "l1rhZzYB5WtrSykbl2iOUvNrx2pRKGyNC8f7IqAwK3bUvBk6SCnwVT1E2d8TAUIH\n" +
                "DNatB779uEvjOy7QYsLluz6NklbA1OWyEpW+z1oDJP3TXoxlwMttmcBTF8/aXlEG\n" +
                "AtoUxDY4AAMEFEuzjccdVc+srS8NHDTtTdkmAephxiZ/84R97CJ+QkvO84RzUVG4\n" +
                "tiWZ10ZRS6szEBpL15FEmbxUCjfd0OMaaYJcJZStsFzCXz/9TnnE1BcUs+/3txQj\n" +
                "KQVHK3xDOgY3jvAg+MQDA59xiJOhhZ3syAl6hLB5Uh1AVMa7QfDu+8gBuGpIZJx3\n" +
                "JEH671FRvUY/3blBfu+lTvhPONjXwg5TGyJQ4/7VV1v0cSG8ogAwaED2JEZSUI26\n" +
                "D7Uxabg6VGxvjsfsbBwsFqNP9kkCZkRa0avUYQm9CwNnm4hYcQHMOSy2xI/+5ST4\n" +
                "KnFufVSzYyp6/WSVwKWSN3Q83keDcQOkZYzSNhBSWu4ZEdHegJRoWDVktSgjey+p\n" +
                "8uJ36rPIGi79+IB75GacVteCS9HwTBK8eJVdrP4Lfy2nYbahJHknqyKtN0fyGdmz\n" +
                "O3d5Z50suh3IuTG9q5MxAoIBAQDvEomJjFmAN3Phbo9CTMhBB5QfBE61U2SSHUjg\n" +
                "UzjSFDHzgdOuvuGC1steGV/bWxToHrFvoDgJV5T9/M12V6l30Lti0vBX+BlDvmCk\n" +
                "jNa+xwKpkpmbdALxlIteJOLphAZ0Ym9lImooTanFf8H+D9LFpNgTrHrn9CCVOnkg\n" +
                "GCMDyWaWmCNEVZ9KO6S2LeZ4JZS7ciZ7jk2oCR4LkqAR/Ez3Ppmuu/IEHa6ssrdp\n" +
                "R0w5tdWTbiNnIGSAZwFHlwspebVc9MHEha/znVUq/Owhl8FqgB0MVzMt2OCiDLsX\n" +
                "eMgxZeXTXSyADvbyPZ4j0hLm6jqq0M6FrqWVRnvvLAocfDjjAoIBAQDsAcEqR9e8\n" +
                "BihLsXnFEzhcOATOs3rCOlJ3dtLgeaOz0kQ9Y+hwj3AH7KGntnHXW3JuS1iPGAwD\n" +
                "g62Cjx3FRVEWwldkUqFe8vHVudu3y43jeuVh6b8xuDZONVBRdQcPRY7mxIwWJRvh\n" +
                "dalY1984+mCLNw7RInkzy95Yv3TNtZB+6QJ69qxqTeXnQWNuIDYRUazdyZ3+9d6F\n" +
                "2XuawbaCL7FQb2xbGYGwRJTdCWywg6TZzciPWBJfwYIooi0vTQ0enATrnwQouUFL\n" +
                "bGQ3YviWWS5q9RP5j96TPrHLq8H1z+B72/YaeT+lan36mSRKsBr8QcMDJX9zFZPh\n" +
                "ECy8x03aehrpAoIBAQC0807usTA8/7vR8SC1ifA4aEgQge4hCJGilk/GmrbzKx3z\n" +
                "tVxHc2q04WbkPkhzeykD19dtKdPAHm5DH8lTvV4jtfVfA1GvA7X7tGjpo0AW/gJh\n" +
                "3vgs1U41E7248CpfnPJVvPubjMTU5JOPTPfEGK3rsq1plq8gSYMv8CYlyJ8YCqR/\n" +
                "b3+iBTyfry0oRu2eGrPMfMXr1vWoLd5z2/MUKecHbHZd7xtrShwf0tVH9hMXyy1w\n" +
                "fXiGYdov5cbuLMDiD6DaTtcqrBVVSsxf0TfY5UgcGAPkh0vRc8nyXbhuN5ku6nVd\n" +
                "2bQI6Uq4ZzL+4c40wSzOhWULgfkKV2MO0EKG9O8JAoIBAQDUwDQo8EC7X/WdXqz+\n" +
                "CniJMXqr90HXq4nB5dztvNnk9czMZq8YIUYF7rw/mwl+8RHz+Xoo7K2P0Xlts6RL\n" +
                "vFQAJ0tuxcpw9KMrXvOB+T68bYIwxO21XXGfCRKRi+TEUJkk0NPT9rnuggoaa+fv\n" +
                "zk2P0h9KSkBmgAa9jEI4Ws+aiGTTAmGlJvn0gY6nrOPwsucZvHHwcCacFNUHSk9D\n" +
                "hsjaUMemTBUMGJb1t1RCvzmxmn+NMQDHT4MNLD19YYFNMaqB2YR/TZld66VgBJlB\n" +
                "t71PcAUEuTwVErRmfTxJYo7kOQLfFKRacuiEKt97cMuy0XmB8aC11yLLBbC+sRAu\n" +
                "vlpZAoIBABQbwet2iECjwu0thLS+UPGeK8kTCQacz2ijJUOkhzXxy+k121VP9OkH\n" +
                "JCddmL36kQQn04DHCV9ML1TQzcs3wWtkWRj63SiBeKnoL6NyjWRBM9ejFgcJ2KH1\n" +
                "Nmct9lbJ6zs83zfSHkhbUhNw1Uf4jIr3P9GMgW7eNduNiUPL/oBGqMW1FuccO29o\n" +
                "DDHlx9Ei/mcutQ8wtAs6Ru1yg5KeoqqkOghf+weqlU7+Dby1rFsnXSbx5/920dva\n" +
                "hLBC/vpK2Ea/X1TjEY3Zu7kBvjnQh082nmoGhoopMZoFS9U1qV/LDNMrPNduEdNZ\n" +
                "Ld4jGxJNXbDN22CtWNIAyP6K+BBUlgw=\n" +
                "-----END PRIVATE KEY-----\n")
        password.set("Chechonito14")
    }

    publishPlugin {
        token.set("perm:bWFydGluYWxlNA==.OTItMTAyNTQ=.HUi1jANqEtJg08HXPdZ5WYiFIpLKue")
    }
}
