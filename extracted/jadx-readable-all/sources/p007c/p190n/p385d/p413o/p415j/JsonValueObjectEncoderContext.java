package p007c.p190n.p385d.p413o.p415j;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import p007c.p190n.p385d.p413o.EncodingException;
import p007c.p190n.p385d.p413o.FieldDescriptor;
import p007c.p190n.p385d.p413o.ObjectEncoder;
import p007c.p190n.p385d.p413o.ObjectEncoderContext;
import p007c.p190n.p385d.p413o.ValueEncoder;
import p007c.p190n.p385d.p413o.ValueEncoderContext;

/* JADX INFO: renamed from: c.n.d.o.j.f, reason: use source file name */
/* JADX INFO: compiled from: JsonValueObjectEncoderContext.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* JADX INFO: renamed from: a */
    public boolean f27027a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f27028b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, ObjectEncoder<?>> f27029c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<?>, ValueEncoder<?>> f27030d;

    /* JADX INFO: renamed from: e */
    public final ObjectEncoder<Object> f27031e;

    /* JADX INFO: renamed from: f */
    public final boolean f27032f;

    public JsonValueObjectEncoderContext(Writer writer, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z) {
        this.f27028b = new JsonWriter(writer);
        this.f27029c = map;
        this.f27030d = map2;
        this.f27031e = objectEncoder;
        this.f27032f = z;
    }

    @Override // p007c.p190n.p385d.p413o.ObjectEncoderContext
    /* JADX INFO: renamed from: a */
    public ObjectEncoderContext mo12046a(FieldDescriptor fieldDescriptor, long j2) throws IOException {
        String str = fieldDescriptor.f27015a;
        m12058k();
        this.f27028b.name(str);
        m12058k();
        this.f27028b.value(j2);
        return this;
    }

    @Override // p007c.p190n.p385d.p413o.ObjectEncoderContext
    /* JADX INFO: renamed from: b */
    public ObjectEncoderContext mo12047b(String str, boolean z) throws IOException {
        m12058k();
        this.f27028b.name(str);
        m12058k();
        this.f27028b.value(z);
        return this;
    }

    @Override // p007c.p190n.p385d.p413o.ObjectEncoderContext
    /* JADX INFO: renamed from: c */
    public ObjectEncoderContext mo12048c(String str, long j2) throws IOException {
        m12058k();
        this.f27028b.name(str);
        m12058k();
        this.f27028b.value(j2);
        return this;
    }

    @Override // p007c.p190n.p385d.p413o.ObjectEncoderContext
    /* JADX INFO: renamed from: d */
    public ObjectEncoderContext mo12049d(String str, int i) throws IOException {
        m12058k();
        this.f27028b.name(str);
        m12058k();
        this.f27028b.value(i);
        return this;
    }

    @Override // p007c.p190n.p385d.p413o.ValueEncoderContext
    /* JADX INFO: renamed from: e */
    public ValueEncoderContext mo12052e(String str) throws IOException {
        m12058k();
        this.f27028b.value(str);
        return this;
    }

    @Override // p007c.p190n.p385d.p413o.ValueEncoderContext
    /* JADX INFO: renamed from: f */
    public ValueEncoderContext mo12053f(boolean z) throws IOException {
        m12058k();
        this.f27028b.value(z);
        return this;
    }

    @Override // p007c.p190n.p385d.p413o.ObjectEncoderContext
    /* JADX INFO: renamed from: h */
    public ObjectEncoderContext mo12051h(FieldDescriptor fieldDescriptor, Object obj) throws IOException {
        return mo12050g(fieldDescriptor.f27015a, obj);
    }

    /* JADX INFO: renamed from: i */
    public JsonValueObjectEncoderContext m12056i(Object obj, boolean z) throws IOException {
        int i = 0;
        if (z) {
            if (obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number)) {
                Object[] objArr = new Object[1];
                objArr[0] = obj == null ? null : obj.getClass();
                throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
            }
        }
        if (obj == null) {
            this.f27028b.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f27028b.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f27028b.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m12056i(it.next(), false);
                }
                this.f27028b.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f27028b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        mo12050g((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f27028b.endObject();
                return this;
            }
            ObjectEncoder<?> objectEncoder = this.f27029c.get(obj.getClass());
            if (objectEncoder != null) {
                if (!z) {
                    this.f27028b.beginObject();
                }
                objectEncoder.mo2772a(obj, this);
                if (!z) {
                    this.f27028b.endObject();
                }
                return this;
            }
            ValueEncoder<?> valueEncoder = this.f27030d.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.mo2772a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                m12058k();
                this.f27028b.value(strName);
                return this;
            }
            ObjectEncoder<Object> objectEncoder2 = this.f27031e;
            if (!z) {
                this.f27028b.beginObject();
            }
            objectEncoder2.mo2772a(obj, this);
            if (!z) {
                this.f27028b.endObject();
            }
            return this;
        }
        if (obj instanceof byte[]) {
            m12058k();
            this.f27028b.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        this.f27028b.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                this.f27028b.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j2 = jArr[i];
                m12058k();
                this.f27028b.value(j2);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.f27028b.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.f27028b.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                m12056i(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                m12056i(obj2, false);
            }
        }
        this.f27028b.endArray();
        return this;
    }

    @Override // p007c.p190n.p385d.p413o.ObjectEncoderContext
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public JsonValueObjectEncoderContext mo12050g(String str, Object obj) throws IOException {
        if (this.f27032f) {
            if (obj == null) {
                return this;
            }
            m12058k();
            this.f27028b.name(str);
            return m12056i(obj, false);
        }
        m12058k();
        this.f27028b.name(str);
        if (obj != null) {
            return m12056i(obj, false);
        }
        this.f27028b.nullValue();
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final void m12058k() throws IOException {
        if (!this.f27027a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
