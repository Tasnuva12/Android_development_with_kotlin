package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),

                    ) { innerPadding ->
                    Column (
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ){
                        HeaderImage(
                            title= stringResource(R.string.jetpack_compose_tutorial),
                            intro= stringResource(R.string.intro),
                            body= stringResource(R.string.body)
                        )
                    }
                }
            }
        }
    }
}
@Composable
fun ContentText(title:String,intro:String,body:String,modifier: Modifier = Modifier){
    Column (modifier=modifier){
        Text(
            text = title,
            fontSize=24.sp,
            modifier = Modifier.padding(bottom = 10.dp)





        )
        Text(
            text =intro,
            modifier = Modifier.padding(bottom = 10.dp) .fillMaxWidth(),
            textAlign = TextAlign.Justify


        )
        Text(
            text=body,
                    modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Justify

        )
    }
}

@Composable
fun HeaderImage(title:String,intro: String,body: String,modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.bg_compose_background)
   Column(modifier=modifier){
       Image(
           painter = image,
           contentDescription = null,
           contentScale = ContentScale.FillWidth
       )
       ContentText(title = title, intro =intro , body =body ,
           modifier = Modifier
               .fillMaxSize()
               .padding(16.dp)

           )


   }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
         HeaderImage(title= stringResource(R.string.jetpack_compose_tutorial),intro=stringResource(R.string.intro),
             body= stringResource(R.string.body))
    }
}