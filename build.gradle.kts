plugins {
    `java-library`
    id("at.released.wasm2class.plugin") version "0.3"
}

repositories {
    mavenLocal()
    mavenCentral()
}

wasm2class {
    targetPackage.set("com.certora.sui")
    modules {
        create("moveBuild") {
            wasm.set(file("move-build.wasm"))
        }
    }
}

dependencies {
	implementation("com.dylibso.chicory:wasi:1.3.0")
}