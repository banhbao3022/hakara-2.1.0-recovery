package p007c.p190n.p430e;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.i, reason: use source file name */
/* JADX INFO: compiled from: Gson.java */
/* JADX INFO: loaded from: classes.dex */
public class Gson4 extends TypeAdapter2<AtomicLong> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TypeAdapter2 f27554a;

    public Gson4(TypeAdapter2 typeAdapter2) {
        this.f27554a = typeAdapter2;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public AtomicLong mo12212a(JsonReader2 jsonReader2) throws IOException {
        return new AtomicLong(((Number) this.f27554a.mo12212a(jsonReader2)).longValue());
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        this.f27554a.mo12213b(jsonWriter, Long.valueOf(atomicLong.get()));
    }
}
