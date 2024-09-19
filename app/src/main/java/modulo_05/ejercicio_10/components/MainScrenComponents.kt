package modulo_05.ejercicio_10.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavActionBuilder
import androidx.navigation.NavController
import modulo_05.ejercicio_10.ContentHomeView
import modulo_05.ejercicio_10.R
import modulo_05.ejercicio_10.navigation.NavigationItem
import modulo_05.ejercicio_10.viewmodel.IMCViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyScaffold(
    myviewModel: ViewModel? = null,
    navController: NavController,
    navigationIcon: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue,
                    navigationIconContentColor = Color.White,
                ),
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        color = Color.White
                    )
                },
                navigationIcon = navigationIcon
            )
        },
    )
    { innerPadding ->
        content(innerPadding)
    }

}











//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun MyScaffold(
//    myviewModel: ViewModel? = null,
//    navController: NavController,
//    content: @Composable (PaddingValues) -> Unit
//) {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                colors = TopAppBarDefaults.topAppBarColors(
//                    containerColor = Color.Blue,
//                    navigationIconContentColor = Color.White,
//                ),
//                title = {
//                    Text(
//                        text = stringResource(id = R.string.app_name),
//                        color = Color.White
//                    )
//                },
//                navigationIcon = {
//                    IconButton(onClick = { /* "Open nav drawer" */ }) {
//                        Icon(Icons.Filled.Menu, contentDescription = "Localized description")
//                    }
//                }
//            )
//        },
//    )
//        { innerPadding ->
//             content(innerPadding)
//        }
//
//}

@Composable
fun PatientCard(
    nombre: String,
    navController: NavController
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = nombre,
                onValueChange = { },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(color = Color.Red),
                label = { Text("Nombre paciente") },
                readOnly = true,
                singleLine = true,
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color.Blue,
                    //focusedTextColor =  Color.Green
                ),
            )
            Spacer(
                modifier = Modifier.height(
                    16.dp
                )
            )
            Button(onClick = {
                navController.navigate(NavigationItem.IMCView.route)
            }, modifier = Modifier.align(Alignment.End)) {
                Text("Calcular IMC")
            }
        }
    }
}

