package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractC5118u;

/* JADX INFO: renamed from: c.n.b.f.a.b.w */
/* JADX INFO: loaded from: classes.dex */
public final class C5062w extends AbstractC5118u {

    /* JADX INFO: renamed from: f */
    public final File f25989f;

    /* JADX INFO: renamed from: g */
    public final File f25990g;

    /* JADX INFO: renamed from: h */
    public final NavigableMap<Long, File> f25991h = new TreeMap();

    public C5062w(File file, File file2) throws IOException {
        this.f25989f = file;
        this.f25990g = file2;
        ArrayList<File> arrayList = (ArrayList) C5061v1.m11505a(file, file2);
        if (arrayList.isEmpty()) {
            throw new C5011i0(String.format("Virtualized slice archive empty for %s, %s", file, file2));
        }
        long length = 0;
        for (File file3 : arrayList) {
            this.f25991h.put(Long.valueOf(length), file3);
            length += file3.length();
        }
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractC5118u
    /* JADX INFO: renamed from: a */
    public final long mo11506a() {
        Map.Entry<Long, File> entryLastEntry = this.f25991h.lastEntry();
        return entryLastEntry.getValue().length() + entryLastEntry.getKey().longValue();
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractC5118u
    /* JADX INFO: renamed from: c */
    public final InputStream mo11507c(long j2, long j3) throws IOException {
        if (j2 < 0 || j3 < 0) {
            throw new C5011i0(String.format("Invalid input parameters %s, %s", Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j4 = j2 + j3;
        if (j4 > mo11506a()) {
            throw new C5011i0(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo11506a()), Long.valueOf(j4)));
        }
        Long lFloorKey = this.f25991h.floorKey(Long.valueOf(j2));
        Long lFloorKey2 = this.f25991h.floorKey(Long.valueOf(j4));
        if (lFloorKey.equals(lFloorKey2)) {
            return new C5059v(m11508f(j2, lFloorKey), j3);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(m11508f(j2, lFloorKey));
        Collection<File> collectionValues = this.f25991h.subMap(lFloorKey, false, lFloorKey2, false).values();
        if (!collectionValues.isEmpty()) {
            arrayList.add(new C5000f1(Collections.enumeration(collectionValues)));
        }
        arrayList.add(new C5059v(new FileInputStream((File) this.f25991h.get(lFloorKey2)), j3 - (lFloorKey2.longValue() - j2)));
        return new SequenceInputStream(Collections.enumeration(arrayList));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: f */
    public final InputStream m11508f(long j2, Long l) throws IOException {
        FileInputStream fileInputStream = new FileInputStream((File) this.f25991h.get(l));
        if (fileInputStream.skip(j2 - l.longValue()) == j2 - l.longValue()) {
            return fileInputStream;
        }
        throw new C5011i0(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }
}
