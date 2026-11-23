package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p315a.w72;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x72<T extends w72<T>> {

    /* JADX INFO: renamed from: a */
    public static final x72 f21447a = new x72(true);

    /* JADX INFO: renamed from: b */
    public final la2<T, Object> f21448b;

    /* JADX INFO: renamed from: c */
    public boolean f21449c;

    /* JADX INFO: renamed from: d */
    public boolean f21450d;

    public x72() {
        this.f21448b = new ea2(16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m8722b(T t, Object obj) {
        boolean z;
        t.m8613a();
        Charset charset = p82.f17879a;
        Objects.requireNonNull(obj);
        db2 db2Var = db2.f13204f;
        eb2 eb2Var = eb2.INT;
        switch (r0.f13223y) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof g72) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof i82)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof l92) || (obj instanceof t82)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.m8613a().f13223y, obj.getClass().getName()));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8723a(T t, Object obj) {
        if (!t.m8614b()) {
            m8722b(t, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m8722b(t, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof t82) {
            this.f21450d = true;
        }
        this.f21448b.put(t, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() throws CloneNotSupportedException {
        x72 x72Var = new x72();
        for (int i = 0; i < this.f21448b.m7575b(); i++) {
            Map.Entry<K, Object> entryM7576c = this.f21448b.m7576c(i);
            x72Var.m8723a((w72) entryM7576c.getKey(), entryM7576c.getValue());
        }
        la2<T, Object> la2Var = this.f21448b;
        for (Map.Entry entry : la2Var.f16305i.isEmpty() ? ha2.f14798b : la2Var.f16305i.entrySet()) {
            x72Var.m8723a((w72) entry.getKey(), entry.getValue());
        }
        x72Var.f21450d = this.f21450d;
        return x72Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x72) {
            return this.f21448b.equals(((x72) obj).f21448b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21448b.hashCode();
    }

    public x72(boolean z) {
        ea2 ea2Var = new ea2(0);
        this.f21448b = ea2Var;
        if (!this.f21449c) {
            ea2Var.mo6616a();
            this.f21449c = true;
        }
        if (this.f21449c) {
            return;
        }
        ea2Var.mo6616a();
        this.f21449c = true;
    }
}
