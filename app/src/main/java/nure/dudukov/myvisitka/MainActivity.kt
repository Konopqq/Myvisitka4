package nure.dudukov.myvisitka

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import nure.dudukov.myvisitka.ui.theme.MyvisitkaTheme
import nure.dudukov.myvisitka.ui.theme.visitka
import androidx.compose.ui.Alignment
import androidx.compose.ui.modifier.modifierLocalConsumer
import nure.dudukov.myvisitka.ui.theme.backgroundFon
import nure.dudukov.myvisitka.ui.theme.mydescriptointext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyvisitkaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    businesscard()
                }
            }
        }
    }
}

@Composable
fun businesscard() {
    Column(
        Modifier
            .fillMaxSize()
            .background(backgroundFon)
    ) {
        businesslogo()
        Icontext()
    }
}



@Composable
fun businesslogo(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.android_logo)
    Column() {
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .padding(top = 255.dp, start = 125.dp, end = 125.dp)
                .background(color = visitka)
        )
        Text(
            text = stringResource(R.string.nametitle_text),
            fontSize = 54.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(10.dp)
        )
        Text(
            text = stringResource(R.string.android_developer_text),
            color = mydescriptointext,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )

    }
}

@Composable
fun Icontext(modifier: Modifier = Modifier){
    Column(Modifier.padding(top = 185.dp, start = 60.dp)) {
        Row{
            Icon(Icons.Rounded.Phone, contentDescription = "Localized description",tint  = mydescriptointext)
            Text(
                text = stringResource(R.string.number_text),
                modifier = Modifier
                    .padding(start = 25.dp,top = 1.dp)
            )
        }
        Row(Modifier.padding(top = 8.dp)){

            Icon(Icons.Rounded.Share, contentDescription = "Localized description",tint  = mydescriptointext)
            Text(
                text = stringResource(R.string.androiddev_text),
                modifier = Modifier
                    .padding(start = 25.dp,top = 1.dp)
            )
        }
        Row(Modifier.padding(top = 8.dp)){
            Icon(Icons.Rounded.Email, contentDescription = "Localized description",tint  = mydescriptointext)
            Text(
                text = stringResource(R.string.jendoeemail_text),
                fontSize = 16.sp,
                modifier = Modifier
                    .padding(start = 25.dp,top = 1.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyvisitkaTheme {
        businesscard()

    }
}
