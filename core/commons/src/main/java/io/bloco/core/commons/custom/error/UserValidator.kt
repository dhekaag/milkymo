package io.bloco.core.commons.custom.error

class UserDataValidator {

    fun validatePassword(password: String): Result<Unit, PasswordError> {
        if (password.isEmpty()){
            return Result.Error(PasswordError.EMPTY)
        }

        if(password.length < 9) {
            return Result.Error(PasswordError.TOO_SHORT)
        }

        val hasUppercaseChar = password.any { it.isUpperCase() }
        if(!hasUppercaseChar) {
            return Result.Error(PasswordError.NO_UPPERCASE)
        }

        val hasDigit = password.any { it.isDigit() }
        if(!hasDigit) {
            return Result.Error(PasswordError.NO_DIGIT)
        }

        return Result.Success(Unit)
    }

    fun validateUserId(password: String): Result<Unit, PasswordError> {
        if (password.isEmpty()){
            return Result.Error(PasswordError.EMPTY)
        }

        if(password.length < 9) {
            return Result.Error(PasswordError.TOO_SHORT)
        }

        val hasUppercaseChar = password.any { it.isUpperCase() }
        if(!hasUppercaseChar) {
            return Result.Error(PasswordError.NO_UPPERCASE)
        }

        val hasDigit = password.any { it.isDigit() }
        if(!hasDigit) {
            return Result.Error(PasswordError.NO_DIGIT)
        }

        return Result.Success(Unit)
    }

    enum class PasswordError: Error {
        EMPTY,
        TOO_SHORT,
        NO_UPPERCASE,
        NO_DIGIT
    }
}