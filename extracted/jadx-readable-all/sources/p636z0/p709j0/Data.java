package p636z0.p709j0;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: z0.j0.e, reason: use source file name */
/* JADX INFO: compiled from: Data.java */
/* JADX INFO: loaded from: classes.dex */
public final class Data {

    /* JADX INFO: renamed from: a */
    public static final String f37258a = Logger9.m15886e("Data");

    /* JADX INFO: renamed from: b */
    public static final Data f37259b = new a().m15881a();

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f37260c;

    /* JADX INFO: renamed from: z0.j0.e$a */
    /* JADX INFO: compiled from: Data.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Map<String, Object> f37261a = new HashMap();

        /* JADX INFO: renamed from: a */
        public Data m15881a() throws Throwable {
            Data data = new Data((Map<String, ?>) this.f37261a);
            Data.m15879c(data);
            return data;
        }

        /* JADX INFO: renamed from: b */
        public a m15882b(Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f37261a.put(key, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f37261a.put(key, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.f37261a;
                            boolean[] zArr = (boolean[]) value;
                            String str = Data.f37258a;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            map2.put(key, boolArr);
                        } else if (cls == byte[].class) {
                            Map<String, Object> map3 = this.f37261a;
                            byte[] bArr = (byte[]) value;
                            String str2 = Data.f37258a;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            map3.put(key, bArr2);
                        } else if (cls == int[].class) {
                            Map<String, Object> map4 = this.f37261a;
                            int[] iArr = (int[]) value;
                            String str3 = Data.f37258a;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            map4.put(key, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map5 = this.f37261a;
                            long[] jArr = (long[]) value;
                            String str4 = Data.f37258a;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            map5.put(key, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map6 = this.f37261a;
                            float[] fArr = (float[]) value;
                            String str5 = Data.f37258a;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            map6.put(key, fArr2);
                        } else {
                            if (cls != double[].class) {
                                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                            }
                            Map<String, Object> map7 = this.f37261a;
                            double[] dArr = (double[]) value;
                            String str6 = Data.f37258a;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            map7.put(key, dArr2);
                        }
                    }
                }
            }
            return this;
        }
    }

    public Data() {
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0067: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:39:0x0066 */
    /* JADX INFO: renamed from: a */
    public static Data m15878a(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e;
        ObjectInputStream objectInputStream2;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream3 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i = objectInputStream.readInt(); i > 0; i--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e2) {
                            Log.e(f37258a, "Error in Data#fromByteArray: ", e2);
                        }
                    } catch (IOException e3) {
                        e = e3;
                        Log.e(f37258a, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e4) {
                                Log.e(f37258a, "Error in Data#fromByteArray: ", e4);
                            }
                        }
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        Log.e(f37258a, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream3 = objectInputStream2;
                    if (objectInputStream3 != null) {
                        try {
                            objectInputStream3.close();
                        } catch (IOException e6) {
                            Log.e(f37258a, "Error in Data#fromByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(f37258a, "Error in Data#fromByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
                Throwable th2 = e;
                objectInputStream = null;
                e = th2;
                Log.e(f37258a, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new Data(map);
            } catch (ClassNotFoundException e9) {
                e = e9;
                Throwable th3 = e;
                objectInputStream = null;
                e = th3;
                Log.e(f37258a, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new Data(map);
            } catch (Throwable th4) {
                th = th4;
                if (objectInputStream3 != null) {
                    objectInputStream3.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
            byteArrayInputStream.close();
        } catch (IOException e10) {
            Log.e(f37258a, "Error in Data#fromByteArray: ", e10);
        }
        return new Data(map);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m15879c(Data data) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(data.f37260c.size());
                    for (Map.Entry<String, Object> entry : data.f37260c.entrySet()) {
                        objectOutputStream2.writeUTF(entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e) {
                        Log.e(f37258a, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(f37258a, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f37258a, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e4) {
                            Log.e(f37258a, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(f37258a, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(f37258a, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(f37258a, "Error in Data#toByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m15880b(String str) {
        Object obj = this.f37260c.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Data.class != obj.getClass()) {
            return false;
        }
        Data data = (Data) obj;
        Set<String> setKeySet = this.f37260c.keySet();
        if (!setKeySet.equals(data.f37260c.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f37260c.get(str);
            Object obj3 = data.f37260c.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f37260c.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f37260c.isEmpty()) {
            for (String str : this.f37260c.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f37260c.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public Data(Data data) {
        this.f37260c = new HashMap(data.f37260c);
    }

    public Data(Map<String, ?> map) {
        this.f37260c = new HashMap(map);
    }
}
