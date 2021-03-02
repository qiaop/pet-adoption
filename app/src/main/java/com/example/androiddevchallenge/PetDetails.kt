/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.Pet

@Composable
fun DogDetails(pet: Pet, onAdopt: (Pet) -> Unit = {}) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
    ) {
        Box {
            Image(
                painterResource(pet.picture),
                "Dog picture: ${pet.name}",
                Modifier.aspectRatio(2f),
                contentScale = ContentScale.Fit
            )
            Button(
                { onAdopt(pet) },
                Modifier
                    .align(Alignment.BottomEnd)
                    .padding(20.dp)
            ) {
                Text(text = "Adopt")
            }
        }
        Column(Modifier.padding(20.dp, 10.dp)) {
            Text("Name: ${pet.name}", style = MaterialTheme.typography.h4)
            ProvideTextStyle(MaterialTheme.typography.h5) {
                Text("Breed: ${pet.breed}")
                Text("Location: ${pet.location}")
                Text("Age: ${pet.age}")
                Text("Gender: ${pet.gender}")
                Text("Size: ${pet.size}")
            }
        }
    }
}
@Preview
@Composable
fun DogDetailsPreview() {
    DogDetails(
        Pet(
            "little gao", "Shiba Inu", "Hebei Province, China",
            "Adult", "Female", "Large", R.drawable.xiaogao
        )
    )
}
