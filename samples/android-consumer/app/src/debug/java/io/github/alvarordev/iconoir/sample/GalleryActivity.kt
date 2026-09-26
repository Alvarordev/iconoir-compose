package io.github.alvarordev.iconoir.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.regular.Bell
import io.github.alvarordev.iconoir.compose.regular.NetworkLeft
import io.github.alvarordev.iconoir.compose.regular.StyleBorder
import io.github.alvarordev.iconoir.compose.solid.DotsGrid3x3
import io.github.alvarordev.iconoir.compose.solid.Git
import io.github.alvarordev.iconoir.compose.solid.Heart

class GalleryActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) {
                    Column(Modifier.safeDrawingPadding().padding(24.dp)) {
                        listOf(
                            "Regular · bell" to Iconoir.Regular.Bell,
                            "Solid · heart" to Iconoir.Solid.Heart,
                            "Regular · network-left (transforms)" to Iconoir.Regular.NetworkLeft,
                            "Regular · style-border (dash)" to Iconoir.Regular.StyleBorder,
                            "Solid · dots-grid-3x3 (cutouts)" to Iconoir.Solid.DotsGrid3x3,
                            "Solid · git (clip)" to Iconoir.Solid.Git,
                        ).forEach { (label, vector) ->
                            GalleryRow(label, vector)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun GalleryRow(label: String, imageVector: ImageVector) {
    Row(Modifier.padding(vertical = 12.dp)) {
        Icon(imageVector, contentDescription = label, tint = Color(0xFF294CBB), modifier = Modifier.size(52.dp))
        Text(label, modifier = Modifier.padding(start = 16.dp))
    }
}
