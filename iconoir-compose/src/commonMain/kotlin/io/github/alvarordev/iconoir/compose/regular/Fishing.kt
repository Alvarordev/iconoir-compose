// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/fishing.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Regular.Fishing: ImageVector
    get() = fishingVector.value

private object fishingVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/fishing", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(16f, 7f),
                PathNode.CurveTo(17.1046f, 7f, 18f, 6.10457f, 18f, 5f),
                PathNode.CurveTo(18f, 3.89543f, 17.1046f, 3f, 16f, 3f),
                PathNode.CurveTo(14.8954f, 3f, 14f, 3.89543f, 14f, 5f),
                PathNode.CurveTo(14f, 6.10457f, 14.8954f, 7f, 16f, 7f),
                PathNode.Close,
                PathNode.MoveTo(16f, 7f),
                PathNode.CurveTo(16f, 7f, 16f, 13.0948f, 16f, 17f),
                PathNode.CurveTo(16f, 23f, 6f, 23f, 6f, 17f),
                PathNode.VerticalTo(13f),
                PathNode.LineTo(8f, 15f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
