package proiect.client.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum ClientExceptionCode {
    ALREADY_LOGGED_IN(2000, "This user is already logged in"),
    CAN_NOT_LOGOUT(2001, "Error logging out"),
    HAS_UNFINISHED_BUGS(2002, "This user has unfinished tasks"),
    NOTIFICATION_EXCEPTION(9000, "Error in notification endpoint");
    Integer id;
    String message;
}
