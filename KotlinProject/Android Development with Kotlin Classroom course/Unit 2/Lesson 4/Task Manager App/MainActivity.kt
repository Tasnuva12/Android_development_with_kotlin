package com.example.taskmanager

import android.graphics.Paint.Align
import android.media.Image
import android.os.Bundle


import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(Color.White),


                        )
                    TaskManagerCompleteImage(
                        title = stringResource(R.string.all_tasks_completed),
                        subTitle = stringResource(R.string.nice_work)

                    )

                }
            }
        }
    }
}


@Composable
fun TaskManagerCompleteImage(modifier: Modifier = Modifier, title: String, subTitle: String) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


        ) {

        Image(
            painter = image,
            contentDescription = null, // Add content description for accessibility

        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            color=Color.Black,
            modifier=Modifier.padding(top= 24.dp ,bottom=8.dp)


            )
        Text(
            text = subTitle,
            color=Color.Black,
            fontSize = 16.sp


            )

    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        TaskManagerCompleteImage(
            title = stringResource(R.string.all_tasks_completed),
            subTitle = stringResource(R.string.nice_work)
        )
    }
}