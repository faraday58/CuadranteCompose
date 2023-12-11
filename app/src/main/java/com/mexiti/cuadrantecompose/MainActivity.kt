package com.mexiti.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mexiti.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DivideCompose()

                }
            }
        }
    }
}


@Composable
fun CuadrantText(
    Title: String,
    content: String, 
    color: Color, 
    modifier: Modifier = Modifier  ){
    Column(
       modifier = modifier
           .fillMaxHeight()
           .background(
               color = color
           )
        ,
        verticalArrangement = Arrangement.Center,


    ) {
        Text(text = Title ,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)

        )
        Text(text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)


        )
    }
}



@Composable
fun DivideCompose( modifier: Modifier = Modifier) {

    Column(
        Modifier.fillMaxSize(),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .weight(weight = 0.5F)

        ){
            CuadrantText(
                Title = stringResource(id = R.string.text_composable)
                , content = stringResource(id = R.string.display_text_composable)  ,
                color =Color(0xFFEADDFF),
                modifier = Modifier.weight(weight = 0.5F)
            )
            CuadrantText(
                Title = stringResource(id = R.string.image_composable)
                , content = stringResource(id = R.string.display_image_composable)  ,
                color =Color(0xFFD0BCFF),
                modifier = Modifier.weight(weight = 0.5F)
            )

        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(weight = 0.5F)
            ,
            verticalAlignment = Alignment.CenterVertically
        ){
            CuadrantText(Title = stringResource(id = R.string.row_composable)
                ,
                content = stringResource(id = R.string.display_row_composable) ,
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(weight = 0.5F)
            )
            CuadrantText(Title = stringResource(id = R.string.column_composable)
                ,
                content = stringResource(id = R.string.display_column_composable) ,
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(weight = 0.5F)
            )

        }


    }



}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        DivideCompose( )
    }
}