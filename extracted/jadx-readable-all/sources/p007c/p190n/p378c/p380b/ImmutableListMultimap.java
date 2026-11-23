package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.c.b.s, reason: use source file name */
/* JADX INFO: compiled from: ImmutableListMultimap.java */
/* JADX INFO: loaded from: classes.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap2<K, V> implements Multimap {

    /* JADX INFO: renamed from: c.n.c.b.s$a */
    /* JADX INFO: compiled from: ImmutableListMultimap.java */
    public static final class a<K, V> extends ImmutableMultimap2.a<K, V> {
        /* JADX INFO: renamed from: b */
        public ImmutableListMultimap<K, V> m11649b() {
            Set<Map.Entry<K, Collection<V>>> setEntrySet = this.f26277a.entrySet();
            if (setEntrySet.isEmpty()) {
                return EmptyImmutableListMultimap.f26246k;
            }
            ImmutableMap.a aVar = new ImmutableMap.a(setEntrySet.size());
            int size = 0;
            for (Map.Entry<K, Collection<V>> entry : setEntrySet) {
                K key = entry.getKey();
                ImmutableList2 immutableList2M11642x = ImmutableList2.m11642x(entry.getValue());
                if (!immutableList2M11642x.isEmpty()) {
                    aVar.m11656c(key, immutableList2M11642x);
                    size += immutableList2M11642x.size();
                }
            }
            return new ImmutableListMultimap<>(aVar.m11654a(), size);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: c */
        public a<K, V> m11650c(K k, V... vArr) {
            super.m11657a(k, Arrays.asList(vArr));
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList2<V>> immutableMap, int i) {
        super(immutableMap, i);
    }

    /* JADX INFO: renamed from: f */
    public static <K, V> a<K, V> m11648f() {
        return new a<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(outline.m1590l("Invalid key count ", i));
        }
        ImmutableMap.a aVar = new ImmutableMap.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(outline.m1590l("Invalid value count ", i4));
            }
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            ImmutableList2.a aVar2 = new ImmutableList2.a();
            for (int i5 = 0; i5 < i4; i5++) {
                aVar2.m11646b(objectInputStream.readObject());
            }
            aVar.m11656c(object, aVar2.m11647c());
            i2 += i4;
        }
        try {
            ImmutableMap immutableMapM11654a = aVar.m11654a();
            Serialization2<ImmutableMultimap2> serialization2 = ImmutableMultimap2.b.f26278a;
            Objects.requireNonNull(serialization2);
            try {
                serialization2.f26261a.set(this, immutableMapM11654a);
                Serialization2<ImmutableMultimap2> serialization3 = ImmutableMultimap2.b.f26279b;
                Objects.requireNonNull(serialization3);
                try {
                    serialization3.f26261a.set(this, Integer.valueOf(i2));
                } catch (IllegalAccessException e) {
                    throw new AssertionError(e);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        } catch (IllegalArgumentException e3) {
            throw ((InvalidObjectException) new InvalidObjectException(e3.getMessage()).initCause(e3));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(mo11581a().size());
        for (Map.Entry entry : ((ImmutableMap) mo11581a()).entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
