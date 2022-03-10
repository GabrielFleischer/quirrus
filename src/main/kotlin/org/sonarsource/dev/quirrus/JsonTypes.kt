package org.sonarsource.dev.quirrus

import kotlinx.serialization.Serializable

@Serializable
data class RepositoryApiResponse(val data: RepositoryData? = null, val errors: List<ResponseError>? = null)

@Serializable
data class RepositoryData(val repository: Repository? = null)

@Serializable
data class Repository(val builds: Builds)

@Serializable
data class Builds(val edges: List<Edge>)

@Serializable
data class Edge(val node: BuildNode)

@Serializable
data class BuildNode(val id: String, val buildCreatedTimestamp: Long, val tasks: List<Task>, val branch: String)

@Serializable
data class Task(val id: String, val name: String, val creationTimestamp: Long)

@Serializable
data class ResponseError(val message: String)

@Serializable
data class OwnerRepositoryApiResponse(val data: OwnerRepositoryData? = null, val errors: List<ResponseError>? = null)

@Serializable
data class OwnerRepositoryData(val ownerRepository: OwnerRepository?)

@Serializable
data class OwnerRepository(val id: String)

