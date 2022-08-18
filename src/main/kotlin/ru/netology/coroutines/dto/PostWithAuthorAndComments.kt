package ru.netology.coroutines.dto

class PostWithAuthorAndComments(
    val post: Post,
    val author: Author,
    val comments: List<Comment>
)