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

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Pet

class MainViewModel : ViewModel() {
    val dogs by mutableStateOf(
        listOf(
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
            ),
            Pet(
                "little hu", "American Shorthair", "Liaoning Province, China",
                "Young", "Male", "Small", R.drawable.xiaohu
            ),
            Pet(
                "little hua", "American Shorthair", "Heilongjiang Province, China",
                "Puppy", "Female", "Medium", R.drawable.xiaohua
            ),
            Pet(
                "little ming", "Shiba Inu", "Shanxi Province, China",
                "Puppy", "Male", "Medium", R.drawable.xiaoming
            ),
            Pet(
                "little qiao", "Chinese Pastoral Dog", "Shanxi Province, China",
                "Puppy", "Male", "Medium", R.drawable.xiaoqiao
            ),
            Pet(
                "little s", "Chinese Pastoral Cat", "Guangxi Province, China",
                "Young", "Male", "Medium", R.drawable.xiaosi
            )
        )
    )

    var currentPet: Pet? by mutableStateOf(null)

    fun showDog(pet: Pet) {
        currentPet = pet
    }

    fun closeDog() {
        currentPet = null
    }
}
