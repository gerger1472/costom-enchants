CustomEnchants (Fabric 1.21.1)
==============================

This project is a Fabric mod skeleton for Minecraft 1.21.1 that implements:
- Upgraded Enchanter block (right-click while having >=30 levels -> consumes 30 levels and gives an enchanted book)
- Several custom enchantment registrations (stubs)
- Recipe for the Upgraded Enchanter block
- GitHub Actions workflow to build the mod automatically

How to use (upload to GitHub):
1. Create a GitHub repo (public).
2. Upload all files from this ZIP (you can upload as zipped content extracted).
3. Ensure branch is `main` (default).
4. Go to Actions tab — workflow will run and produce artifact `customenchants-jar` with the built JAR.

How to build locally:
- Requires Java 17 and Gradle. Run `./gradlew build` to produce JAR in `build/libs/`.
