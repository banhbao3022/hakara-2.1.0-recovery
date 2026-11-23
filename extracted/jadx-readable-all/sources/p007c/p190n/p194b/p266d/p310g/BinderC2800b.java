package p007c.p190n.p194b.p266d.p310g;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.lang.reflect.Field;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.g.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2800b<T> extends InterfaceC2799a.a {

    /* JADX INFO: renamed from: f */
    public final T f11964f;

    public BinderC2800b(T t) {
        this.f11964f = t;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: T1 */
    public static <T> T m5639T1(@RecentlyNonNull InterfaceC2799a interfaceC2799a) {
        if (interfaceC2799a instanceof BinderC2800b) {
            return ((BinderC2800b) interfaceC2799a).f11964f;
        }
        IBinder iBinderAsBinder = interfaceC2799a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(outline.m1585g(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        Objects.requireNonNull(field, "null reference");
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
