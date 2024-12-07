package xyz.sortmc.spent_time_tracker

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class UserCache(
    val name: String,
    val uuid: String,
    val expiresOn: String
)

class NameToUuid {
    private fun readUserCache(): String {
        val fileName = "./usercache.json"
        return File(fileName).readText(Charsets.UTF_8)
    }

    fun nameToUuid(name: String): String? {
        val originJson = readUserCache()
        val users: List<UserCache> = try {
            Json.decodeFromString(originJson)
        } catch (e: SerializationException) {
            return e.localizedMessage
        }
        val user = users.find { it.name == name }

        return user?.uuid
    }
}