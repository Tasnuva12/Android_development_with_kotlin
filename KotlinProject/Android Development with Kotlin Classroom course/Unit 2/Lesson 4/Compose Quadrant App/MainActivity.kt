package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column



import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrantApp(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp(modifier: Modifier = Modifier) {

  Column( modifier = modifier
      .fillMaxSize()
      .background(colorResource(R.color.white)) ){
      Row(modifier= Modifier
          .weight(1f)


          .background(colorResource(R.color.purple_700))){
          InformationCard(title=stringResource(R.string.text_composable),desc=stringResource(R.string.text_composable_desc),
              modifier = Modifier.weight(1f).fillMaxHeight(),  backgroundColor= colorResource(R.color.text1))
          InformationCard(title=stringResource(R.string.image_composable),desc=stringResource(R.string.image_composable_desc),  modifier = Modifier.weight(1f).fillMaxHeight(), backgroundColor= colorResource(R.color.text2) )
      }
      Row(modifier= Modifier
          .weight(1f)
          .background(colorResource(R.color.black))

         ){
          InformationCard(title=stringResource(R.string.row_composable),desc=stringResource(R.string.row_composable_desc),  modifier = Modifier.weight(1f).fillMaxHeight(), backgroundColor= colorResource(R.color.text3))
          InformationCard(title=stringResource(R.string.column_composable),desc=stringResource(R.string.column_composable_desc),  modifier = Modifier.weight(1f).fillMaxHeight(), backgroundColor= colorResource(R.color.text4) )
      }

  }
}

@Composable
private fun InformationCard(title:String,desc:String,modifier: Modifier,backgroundColor: Color){
    Column(
        modifier= modifier

            .background(backgroundColor),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = title,
           modifier=Modifier.padding(2.dp),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.bodyLarge,
            color=Color.Black



        )
        Text(
            text =desc,
            modifier = Modifier.padding(16.dp),
            style = MaterialTheme.typography.bodySmall,
            color=Color.Black



        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrantApp()
    }
}