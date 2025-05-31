# sui-move-build-kotlin

[![](https://jitpack.io/v/certora/sui-move-build-kotlin.svg)](https://jitpack.io/#certora/sui-move-build-kotlin)

Makes move-build from the Sui project available to Kotlin code, as a Chicory AOT module.

We are using a WebAssembly build of move-build from the Sui project, to avoid having to deal with multiple
platform-specific binaries.  To make a new WebAssembly build of the compiler:

1. Clone https://github.com/MystenLabs/sui
2. `cd external-crates/move`
3. `cargo build --release --target wasm32-wasip1 -p move-compiler`
4. copy `target/wasm32-wasip1/release/move-build.wasm` to this repo
