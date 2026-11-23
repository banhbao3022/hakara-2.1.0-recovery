package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonSyntaxException;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.l, reason: use source file name */
/* JADX INFO: compiled from: TimeTypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class TimeTypeAdapter extends TypeAdapter2<Time> {

    /* JADX INFO: renamed from: a */
    public static final TypeAdapterFactory f27376a = new a();

    /* JADX INFO: renamed from: b */
    public final DateFormat f27377b = new SimpleDateFormat("hh:mm:ss a");

    /* JADX INFO: renamed from: c.n.e.e0.a0.l$a */
    /* JADX INFO: compiled from: TimeTypeAdapter.java */
    public class a implements TypeAdapterFactory {
        @Override // p007c.p190n.p430e.TypeAdapterFactory
        /* JADX INFO: renamed from: a */
        public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
            if (typeToken.f27513a == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public Time mo12212a(JsonReader2 jsonReader2) throws IOException {
        synchronized (this) {
            if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                jsonReader2.mo12249z0();
                return null;
            }
            try {
                return new Time(this.f27377b.parse(jsonReader2.mo12232F0()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, Time time) throws IOException {
        Time time2 = time;
        synchronized (this) {
            jsonWriter.mo12261x0(time2 == null ? null : this.f27377b.format((Date) time2));
        }
    }
}
