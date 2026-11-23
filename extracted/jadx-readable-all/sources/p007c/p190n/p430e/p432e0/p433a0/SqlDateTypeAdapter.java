package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p007c.p190n.p430e.Gson6;
import p007c.p190n.p430e.JsonSyntaxException;
import p007c.p190n.p430e.TypeAdapter2;
import p007c.p190n.p430e.TypeAdapterFactory;
import p007c.p190n.p430e.p436f0.TypeToken;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.k, reason: use source file name */
/* JADX INFO: compiled from: SqlDateTypeAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class SqlDateTypeAdapter extends TypeAdapter2<Date> {

    /* JADX INFO: renamed from: a */
    public static final TypeAdapterFactory f27374a = new a();

    /* JADX INFO: renamed from: b */
    public final DateFormat f27375b = new SimpleDateFormat("MMM d, yyyy");

    /* JADX INFO: renamed from: c.n.e.e0.a0.k$a */
    /* JADX INFO: compiled from: SqlDateTypeAdapter.java */
    public class a implements TypeAdapterFactory {
        @Override // p007c.p190n.p430e.TypeAdapterFactory
        /* JADX INFO: renamed from: a */
        public <T> TypeAdapter2<T> mo12216a(Gson6 gson6, TypeToken<T> typeToken) {
            if (typeToken.f27513a == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: a */
    public Date mo12212a(JsonReader2 jsonReader2) throws IOException {
        Date date;
        synchronized (this) {
            try {
                if (jsonReader2.mo12234H0() == JsonToken.NULL) {
                    jsonReader2.mo12249z0();
                    date = null;
                } else {
                    try {
                        date = new Date(this.f27375b.parse(jsonReader2.mo12232F0()).getTime());
                    } catch (ParseException e) {
                        throw new JsonSyntaxException(e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return date;
    }

    @Override // p007c.p190n.p430e.TypeAdapter2
    /* JADX INFO: renamed from: b */
    public void mo12213b(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            jsonWriter.mo12261x0(date2 == null ? null : this.f27375b.format((java.util.Date) date2));
        }
    }
}
