# No Limit Anvil

A Minecraft Fabric mod that removes the anvil level 40 limit, allowing unlimited enchantment combinations and repairs.

## Features

- Removes the 40 level limit from anvils
- Allows unlimited enchantment combinations
- Works with both single-player and multiplayer
- Compatible with Minecraft 1.21.8

## Download
- If you just want the mod itself and you don't care about the source code, just download the jar file for the corresponding Minecraft version from the releases folder

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/)
2. Install [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
3. Download the latest release of this mod
4. Place the mod file in your `mods` folder

## Building

To build the mod yourself:

1. Clone this repository
2. Run `./gradlew build`
3. The built mod will be in `build/libs/`

## Testing

### Development Testing

1. Run the mod in development environment:
   ```bash
   ./gradlew runClient
   ```

      **Note**: If you encounter mixin errors during startup, check that:
      - All package names in your mixin configuration files match your actual package structure
      - Mixin classes exist in the specified locations
      - The mod ID in `fabric.mod.json` matches your mixin configuration


## Usage

Simply install the mod and use anvils as normal. The level 40 limit will be completely removed, allowing you to:

- Combine highly enchanted items
- Repair items without level restrictions
- Create powerful enchantment combinations that were previously impossible

## Compatibility

- Minecraft: 1.21.8
- Fabric Loader: 0.16.9+
- Fabric API: 0.110.0+1.21.8

## License

This mod is licensed under the MIT License. See [LICENSE](LICENSE) for details.
