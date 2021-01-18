package com.uas0822.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()
        list.add(User(
            "JakeWharton",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharton",
            "https://api.github.com/users/JakeWharton/followers",
            23,
            "https://api.github.com/users/JakeWharton/following{/other_user}",
            16,
            "https://api.github.com/users/JakeWharton/repos",
            10
        ))

        list.add(User(
            "JakeWharton2",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharton",
            "https://api.github.com/users/JakeWharton/followers",
            23,
            "https://api.github.com/users/JakeWharton/following{/other_user}",
            16,
            "https://api.github.com/users/JakeWharton/repos",
            10
        ))

        list.add(User(
            "JakeWharton3",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharton",
            "https://api.github.com/users/JakeWharton/followers",
            23,
            "https://api.github.com/users/JakeWharton/following{/other_user}",
            16,
            "https://api.github.com/users/JakeWharton/repos",
            10
        ))

        list.add(User(
            "JakeWharton4",
            "https://avatars0.githubusercontent.com/u/66577?v=4",
            "https://github.com/JakeWharton",
            "https://api.github.com/users/JakeWharton/followers",
            23,
            "https://api.github.com/users/JakeWharton/following{/other_user}",
            16,
            "https://api.github.com/users/JakeWharton/repos",
            10
        ))


        return list
    }
}