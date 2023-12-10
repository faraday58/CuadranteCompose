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

/*
@Composable
fun CuadrantText(Title: String, content: String, color: Color  ){

}
*/


@Composable
fun DivideCompose( modifier: Modifier = Modifier) {

    Column(
        Modifier.fillMaxHeight(),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .weight(weight = 0.5F)

        ){
            Column(
                Modifier
                    .weight(weight = 0.5F)
                    .fillMaxHeight()
                    .background(
                        Color(0xFFEADDFF)
                    )
                ,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = stringResource(id = R.string.text_composable) ,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                    ,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )
                Text(text = stringResource(id = R.string.display_text_composable),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(16.dp)

                )
            }
            Column(
                Modifier
                    .weight(weight = 0.5F)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
                ,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = stringResource(id = R.string.image_composable),
                    fontWeight = FontWeight.Bold
                    ,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )
                Text(text = stringResource(id = R.string.display_image_composable),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                )
            }
        }
        Row(
            Modifier
                .fillMaxWidth()
                .weight(weight = 0.5F)
            ,
            verticalAlignment = Alignment.CenterVertically
        ){
            Column(
                Modifier
                    .weight(weight = 0.5F)
                    .fillMaxHeight()
                    .background(
                        Color(0xFFB69DF8)
                    )
                ,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = stringResource(id = R.string.row_composable),
                    fontWeight = FontWeight.Bold
                    ,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)

                )
                Text(text = stringResource(id =  R.string.display_row_composable),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                    )
            }
            Column(
                Modifier
                    .weight(weight = 0.5F)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
                ,
                verticalArrangement = Arrangement.Center

            ) {
                Text(text = stringResource(id = R.string.column_composable),
                    fontWeight = FontWeight.Bold
                    ,
                    textAlign = TextAlign.Center,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )
                Text(text = stringResource(id = R.string.display_column_composable),
                    textAlign = TextAlign.Justify,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                    )
            }
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