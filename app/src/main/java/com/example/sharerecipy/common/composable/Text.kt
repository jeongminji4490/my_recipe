package com.example.sharerecipy.common.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sharerecipy.common.theme.Black
import com.example.sharerecipy.common.theme.LightFont
import com.example.sharerecipy.common.theme.Navy
import com.example.sharerecipy.common.theme.White
import com.example.sharerecipy.R.string as AppText

@Composable
fun ManualTextComposable(
    text: String?
) {
    Text(
        text = text ?: "",
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        textAlign = TextAlign.Left,
        color = Navy,
        fontSize = 16.sp,
        fontFamily = LightFont
    )
}