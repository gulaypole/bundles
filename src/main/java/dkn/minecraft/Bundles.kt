package dkn.minecraft

import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.plugin.java.JavaPlugin

class Bundles : JavaPlugin() {
    override fun onEnable() {
        val key: NamespacedKey = NamespacedKey(this, "Bundles")
        val item: ItemStack = ItemStack(Material.BUNDLE)
        val recipe: ShapedRecipe = ShapedRecipe(key, item).apply {
            shape(
                "SLS",
                "L L",
                "LLL"
            )
            setIngredient('N', Material.STRING)
            setIngredient('L', Material.LEATHER)
        }
        getServer().addRecipe(recipe)
    }
}
