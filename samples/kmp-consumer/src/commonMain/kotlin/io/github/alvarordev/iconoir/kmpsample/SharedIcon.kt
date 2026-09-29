package io.github.alvarordev.iconoir.kmpsample

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.rememberIconoirVector
import io.github.alvarordev.iconoir.compose.regular.Bell
import io.github.alvarordev.iconoir.compose.solid.Heart

@Composable
fun SharedIcon(modifier: Modifier = Modifier) {
    Image(
        painter = rememberVectorPainter(rememberIconoirVector(Iconoir.Regular.Bell, strokeWeight = 2f)),
        contentDescription = "Notifications",
        modifier = modifier,
    )
    Image(
        painter = rememberVectorPainter(Iconoir.Solid.Heart),
        contentDescription = null,
        modifier = modifier,
    )
}
