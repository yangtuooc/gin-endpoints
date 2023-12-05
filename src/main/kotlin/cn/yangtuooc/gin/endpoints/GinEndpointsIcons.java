package cn.yangtuooc.gin.endpoints;

import com.intellij.openapi.util.IconLoader;
import javax.swing.Icon;
import org.jetbrains.annotations.NotNull;

/**
 * @author yangtuo
 */
public final class GinEndpointsIcons {

  private static @NotNull Icon load(@NotNull String path, @NotNull Class<?> anchor) {
    return IconLoader.getIcon(path, anchor);
  }

  public static final @NotNull Icon GinRoute = load("/icons/gin-route.png", GinEndpointsIcons.class);
}
