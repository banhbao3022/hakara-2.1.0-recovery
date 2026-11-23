package p007c.p190n.p430e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.j, reason: use source file name */
/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes.dex */
public class Gson5 extends TypeAdapter2<AtomicLongArray> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TypeAdapter2 f27555a;

    public Gson5(TypeAdapter2 typeAdapter2) {
        this.f27555a = typeAdapter2;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public AtomicLongArray mo12212a(JsonReader2 jsonReader2) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader2.mo12241a();
        while (jsonReader2.mo12236O()) {
            arrayList.add(Long.valueOf(((Number) this.f27555a.mo12212a(jsonReader2)).longValue()));
        }
        jsonReader2.mo12247u();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        jsonWriter.mo12255c();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.f27555a.mo12213b(jsonWriter, Long.valueOf(atomicLongArray2.get(i)));
        }
        jsonWriter.mo12259u();
    }
}
