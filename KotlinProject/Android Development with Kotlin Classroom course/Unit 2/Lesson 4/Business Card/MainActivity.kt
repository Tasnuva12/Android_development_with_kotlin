package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.Color
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .background(colorResource(id = R.color.background))) { innerPadding ->
                   BusinessCardApp(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp( modifier: Modifier = Modifier) {
    Box( modifier = modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.background)),
        ){
        Column(
           modifier=Modifier.fillMaxSize().padding(top=140.dp),
            horizontalAlignment = Alignment.CenterHorizontally,



        ) {
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(colorResource(id = R.color.img_background))
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = "Android Logo",


                    )
            }

            Text(
                text = stringResource(R.string.Name),
                fontSize = 35.sp,
                color = Color.Black
            )
            Text(
                text = stringResource(R.string.designation),
                color = colorResource(R.color.designation_color),
            )



        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 60.dp,bottom=30.dp)
                .fillMaxWidth(),


        ){
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),





            ) {
                Row(modifier = Modifier) {
                    Image(
                        painter = painterResource(R.drawable.baseline_phone_24),
                        contentDescription = "Phone Number"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "+880175341234",
                        color = Color.Black
                    )
                }


                Row(modifier = Modifier) {
                    Image(
                        painter = painterResource(R.drawable.baseline_share_24),
                        contentDescription = "Phone Number",

                        )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "@AndroidDev",
                        color = Color.Black,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                }

                Row(modifier = Modifier) {
                    Image(
                        painter = painterResource(R.drawable.baseline_email_24),
                        contentDescription = "Email",

                        )
                    Spacer(modifier = Modifier.width(10.dp))

                    Text(
                        text = "jennifer.doe@gmail.com",
                        color = Color.Black,
                        modifier = Modifier.padding(end = 10.dp)
                    )

                }


            }
        }

    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
           BusinessCardApp()
    }
}