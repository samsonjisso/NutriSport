import androidx.compose.runtime.Composable
import androidx.compose.material.Button
import androidx.compose.material.Text

@Composable
fun GoogleButton(
    modifier: Modifier = Modifier,
    loading: Boolean = false,
    primaryText: String = "Sign in with Google",
    secondaryText: String? = "Please wait while we sign you in...",
    icon: DrawableResource = Resources.Image.GoogleLogo,

    onClick: () -> Unit
    ) {
    Button(onClick = onClick) {
        Text(primaryText)
    }
}