 package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.greetingcard.ui.theme.HappyBirthdayTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier
                        .padding(vertical = 36.dp)
                        .fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    TwoSectionScreen()
                }
            }
        }
    }
}


 @Composable
 fun ImageCard(){
     val image = painterResource(R.drawable.bg_compose_background)

     Box(){
         Image(
             painter = image,
             contentDescription = null,
             modifier = Modifier.fillMaxWidth()
         )
     }
 }

 @Composable
 fun CustomText(value: String){
     Column (
         modifier = Modifier
             .fillMaxWidth()
             .padding(16.dp)
     ){
         Text(
             text = value,
             fontSize = 24.sp,
             lineHeight = 50.sp
         )
     }
 }

 @Composable
 fun TwoSectionScreen() {
     Column(
         modifier = Modifier
             .fillMaxSize()
     ) {
         Box(
             modifier = Modifier
                 .weight(1f)
                 .fillMaxWidth(),
             contentAlignment = Alignment.Center
         ) {
             TopSectionContent()
         }

         Box(
             modifier = Modifier
                 .fillMaxWidth(),
             contentAlignment = Alignment.Center
         ) {
             BottomSectionContent()
         }
     }
 }

 @Composable
 fun TopSectionContent() {
     // Replace with actual content
     Text(text = "Top Section")
 }

 @Composable
 fun BottomSectionContent() {
     // Replace with actual content
     Text(text = "Bottom Section")
 }


 @Composable
 fun CustomGridLayout() {
     Row(
         modifier = Modifier
             .fillMaxSize()
     ) {

         Column(
             modifier = Modifier
                 .weight(1f)
                 .fillMaxHeight()
         ) {
             Card(title = "Title 1", description = "Description 1")
             Card(title = "Title 2", description = "Description 2")
         }

         Column(
             modifier = Modifier
                 .weight(1f)
                 .fillMaxHeight()
         ) {
             Card(title = "Title 3", description = "Description 3")
             Card(title = "Title 4", description = "Description 4")
         }
     }
 }


 @Composable
 fun Card(title: String, description: String){
     Column (
         modifier = Modifier
             .fillMaxWidth()
             .padding(16.dp)
     ){
         Text(text = title)
         Text(text = description)
     }
 }


@Preview(
    showBackground = true
)
@Composable
fun GreetingPreview() {
    HappyBirthdayTheme {
        ImageCard()
    }
}
