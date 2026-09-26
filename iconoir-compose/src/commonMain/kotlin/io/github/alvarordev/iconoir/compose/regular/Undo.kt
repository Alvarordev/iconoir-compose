// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/undo.svg. Do not edit.
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

public val Iconoir.Regular.Undo: ImageVector
    get() = undoVector.value

private object undoVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/undo", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(4.5f, 8f),
                PathNode.CurveTo(8.5f, 8f, 11f, 8f, 15f, 8f),
                PathNode.CurveTo(15f, 8f, 15f, 8f, 15f, 8f),
                PathNode.CurveTo(15f, 8f, 20f, 8f, 20f, 12.7059f),
                PathNode.CurveTo(20f, 18f, 15f, 18f, 15f, 18f),
                PathNode.CurveTo(11.5714f, 18f, 9.71429f, 18f, 6.28571f, 18f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(7.5f, 11.5f),
                PathNode.CurveTo(6.13317f, 10.1332f, 5.36683f, 9.36683f, 4f, 8f),
                PathNode.CurveTo(5.36683f, 6.63317f, 6.13317f, 5.86683f, 7.5f, 4.5f),
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
