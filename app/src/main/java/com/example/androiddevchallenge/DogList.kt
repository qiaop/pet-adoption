
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Pet
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DogList(pets: List<Pet>, onDogClick: (Pet) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.background),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(pets) { dog ->
            DogItem(
                dog,
                Modifier.clickable {
                    onDogClick(dog)
                }.fillMaxWidth()
            )
        }
    }
}

@Composable
fun DogItem(pet: Pet, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            Image(
                painterResource(pet.picture),
                "Picture of dog: ${pet.name}",
                Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(pet.name, style = MaterialTheme.typography.h4)
                Text(pet.breed)
                Text(pet.location)
            }
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    val dogs = listOf(
        Pet(
            "old gao", "British shorthair cat", "Shandong Province, China",
            "Adult", "male", "Large", R.drawable.laogao
        ),
        Pet(
            "old yan", "rabbit", "Anhui Province, China",
            "Young", "Female", "Medium", R.drawable.laoyan
        ),
        Pet(
            "little gao", "Shiba Inu", "Hebei Province, China",
            "Adult", "Male", "Large", R.drawable.xiaogao
        )
    )
    MyTheme {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogListPreviewDark() {
    val dogs = listOf(
        Pet(
            "old gao", "British shorthair cat", "Shandong Province, China",
            "Adult", "male", "Large", R.drawable.laogao
        ),
        Pet(
            "old yan", "rabbit", "Anhui Province, China",
            "Young", "Female", "Medium", R.drawable.laoyan
        ),
        Pet(
            "little gao", "Shiba Inu", "Hebei Province, China",
            "Adult", "Male", "Large", R.drawable.xiaogao
        )
    )
    MyTheme(darkTheme = true) {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogItemPreview() {
    MyTheme {
        DogItem(
            Pet(
                "old gao", "British shorthair cat", "Shandong Province, China",
                "Adult", "male", "Large", R.drawable.laogao
            )
        )
    }
}

@Preview
@Composable
fun DogItemPreviewDark() {
    MyTheme(darkTheme = true) {
        DogItem(
            Pet(
                "old gao", "British shorthair cat", "Shandong Province, China",
                "Adult", "male", "Large", R.drawable.laogao
            )
        )
    }
}