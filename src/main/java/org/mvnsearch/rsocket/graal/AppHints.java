package org.mvnsearch.rsocket.graal;

import org.springframework.context.annotation.Configuration;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.ProxyHint;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.nativex.type.NativeConfiguration;


@NativeHint(proxies = @ProxyHint(types = UserService.class),
        types = @TypeHint(types = AppUser.class))
@Configuration
public class AppHints implements NativeConfiguration {
}
