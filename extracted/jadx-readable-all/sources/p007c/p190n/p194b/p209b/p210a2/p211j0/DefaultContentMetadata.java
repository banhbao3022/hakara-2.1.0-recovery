package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.p, reason: use source file name */
/* JADX INFO: compiled from: DefaultContentMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultContentMetadata implements ContentMetadata2 {

    /* JADX INFO: renamed from: a */
    public static final DefaultContentMetadata f6107a = new DefaultContentMetadata(Collections.emptyMap());

    /* JADX INFO: renamed from: b */
    public int f6108b;

    /* JADX INFO: renamed from: c */
    public final Map<String, byte[]> f6109c;

    public DefaultContentMetadata() {
        this(Collections.emptyMap());
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2984b(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public DefaultContentMetadata m2985a(ContentMetadataMutations contentMetadataMutations) {
        byte[] bytes;
        HashMap map = new HashMap(this.f6109c);
        Objects.requireNonNull(contentMetadataMutations);
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(contentMetadataMutations.f6106b));
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            map.remove(listUnmodifiableList.get(i));
        }
        HashMap map2 = new HashMap(contentMetadataMutations.f6105a);
        for (Map.Entry entry : map2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(map2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bytes = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bytes = ((String) value2).getBytes(Charsets.f26131c);
            } else {
                if (!(value2 instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bytes = (byte[]) value2;
            }
            map.put(str, bytes);
        }
        return m2984b(this.f6109c, map) ? this : new DefaultContentMetadata(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultContentMetadata.class != obj.getClass()) {
            return false;
        }
        return m2984b(this.f6109c, ((DefaultContentMetadata) obj).f6109c);
    }

    public int hashCode() {
        if (this.f6108b == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f6109c.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f6108b = iHashCode;
        }
        return this.f6108b;
    }

    public DefaultContentMetadata(Map<String, byte[]> map) {
        this.f6109c = Collections.unmodifiableMap(map);
    }
}
