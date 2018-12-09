package proiect.business.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * Provides exception codes and description
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum BusinessExceptionCode {
    INVALID_USER(1000,"User does not exist"),
    USER_DEACTIVATED(1001,"User is deactivated"),
    CAN_NOT_ADD_USER(1002, "Can't create user"),
    CAN_NOT_UPDATE_USER(1003, "Can't update user"),
    CAN_NOT_GET_USER(1004, "Can't get user"),
    USER_VALIDATION_EXCEPTION(1005, "ValidationException"),
    EMAIL_EXISTS_ALREADY(1010, "Email already exists"),
    USER_SHOULD_HAVE_AT_LEAST_ONE_ROLE(1011, "At least one role should be associated with a user"),
    USERNAME_NOT_VALID(1006, "Wrong username"),
    PASSWORD_NOT_VALID(1007, "Wrong password"),
    TOO_MANY_ALIKE_USERNAMES(1008,"There are no more suffixes to be generated, consider increasing the range."),
    ROLES_NOT_VALID(1009, "Invalid roles"),
    INVALID_TOKEN(5000,"The token is invalid."),
    CAN_NOT_ADD_NOTIFICATION(9000,"Error during notification add."),
    CAN_NOT_UPDATE_ROLE(1010, "Can't update role"),
    CAN_NOT_FIND_BUG(2001, "Bug not found"),
    CAN_NOT_CLOSE_BUG(2002, "Bug can not be closed from this status"),
    CAN_NOT_CHANGE_BUG_STATUS(2003, "Bug status can not be changed from this status"),
    CAN_NOT_UPDATE_BUG(2004, "Bug can not be updated"),
    CAN_NOT_ADD_BUG(2007, "Bug can not be added"),
    BUG_VALIDATION_EXCEPTION(2005, "ValidationException"),
    CAN_NOT_GET_STATUS(2006, "Can not get status"),
    CAN_NOT_EXPORT_BUG(1010, "Can't export bug due to file error"),
    CAN_NOT_GET_BUG(1011, "Can't get bug");
    Integer id;
    String message;
}
