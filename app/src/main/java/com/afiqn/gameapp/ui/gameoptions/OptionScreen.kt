package com.afiqn.gameapp.ui.gameoptions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.afiqn.gameapp.R
import com.afiqn.gameapp.ui.components.ButtonLabel
import com.afiqn.gameapp.ui.components.OptionButton

@Composable
fun OptionScreen(
    modifier: Modifier = Modifier,
    onCLickVsPlayer: (String) -> Unit = {},
    onClickVsAI: (String) -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        ButtonLabel(textLabel = stringResource(R.string.choose_your_opponent))
        GameOptionNav(
            onCLickVsPlayer = onCLickVsPlayer,
            onClickVsAI = onClickVsAI
        )
        Spacer(modifier = Modifier.size(48.dp))
    }
}

@Composable
fun GameOptionNav(
    onCLickVsPlayer: (String) -> Unit = {},
    onClickVsAI: (String) -> Unit = {}
) {
    OptionButton(
        onClickOption = onCLickVsPlayer,
        textTitle = stringResource(R.string.vs_friend),
        textDesc = stringResource(R.string.vs_friend_message),
        icon = painterResource(id = R.drawable.ic_player)
    )
    Spacer(modifier = Modifier.size(24.dp))
    OptionButton(
        onClickOption = onClickVsAI,
        textTitle = stringResource(R.string.vs_ai),
        textDesc = stringResource(R.string.vs_ai_message),
        icon = painterResource(id = R.drawable.ic_computer)
    )
}