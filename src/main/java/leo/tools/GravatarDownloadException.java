package leo.tools;

public class GravatarDownloadException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public GravatarDownloadException(Throwable cause) {
		super("leo.tools.Gravatar could not be downloaded: " + cause.getMessage(), cause);
	}

}
