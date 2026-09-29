package io.github.alvarordev.iconoir.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir
import io.github.alvarordev.iconoir.compose.rememberIconoirVector
import io.github.alvarordev.iconoir.compose.regular.Bell
import io.github.alvarordev.iconoir.compose.solid.Heart

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) {
                    Column(Modifier.safeDrawingPadding().padding(32.dp)) {
                        Text("Iconoir regular / solid")
                        Row {
                            Icon(rememberIconoirVector(Iconoir.Regular.Bell, strokeWeight = 2f), contentDescription = "Notifications", tint = Color.Black, modifier = Modifier.size(64.dp))
                            Icon(Iconoir.Solid.Heart, contentDescription = null, tint = Color.Red, modifier = Modifier.size(64.dp))
                        }
                    }
                }
            }
        }
    }
}
