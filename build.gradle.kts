plugins {
    val comAndroid = "8.5.0"
    val orgJetBrainsKotlin = "2.0.0"

    id("com.android.application") version "$comAndroid" apply false
    id("com.android.library") version "$comAndroid" apply false
    id("io.ktor.plugin") version "2.3.12" apply false
    id("org.gradle.android.cache-fix") version "3.0.1" apply false
    id("org.jetbrains.kotlin.android") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.jvm") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.js") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.multiplatform") version "$orgJetBrainsKotlin" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "$orgJetBrainsKotlin" apply false
}