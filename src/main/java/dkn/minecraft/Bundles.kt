package dkn.minecraft

import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.plugin.java.JavaPlugin

class Bundles : JavaPlugin() {
    override fun onEnable() {
        val recipe: ShapedRecipe = ShapedRecipe(
            NamespacedKey(this, "Bundles"),
            ItemStack(Material.BUNDLE)
        ).apply {
            shape(
                "SLS",
                "L L",
                "LLL"
            )
            setIngredient('S', Material.STRING)
            setIngredient('L', Material.LEATHER)
        }
        getServer().addRecipe(recipe)
    }
}
