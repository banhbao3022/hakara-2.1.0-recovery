package p007c.p114h.p126d.p129c.p139g;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.d.c.g.c, reason: use source file name */
/* JADX INFO: compiled from: ResourceBaseHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceBaseHelper {
    /* JADX INFO: renamed from: a */
    public static void m2163a(Context context, String str, String str2, String str3) {
        if (new File(outline.m1600v(str3, "/", str2)).exists()) {
            Log.d("ResourceBaseHelper", "decompressAsset: directory " + str2 + " is existed!");
            return;
        }
        AssetManager assets = context.getAssets();
        try {
            InputStream inputStreamOpen = assets.open(str);
            Map<String, ArrayList<ResourceCodec.b>> mapM2165a = null;
            try {
                try {
                    mapM2165a = ResourceCodec.m2165a(inputStreamOpen);
                } catch (Throwable th) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                Log.e("ResourceBaseHelper", "decompressAsset: ", e2);
            }
            try {
                inputStreamOpen.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            if (mapM2165a == null) {
                return;
            }
            try {
                InputStream inputStreamOpen2 = assets.open(str);
                if (inputStreamOpen2 != null) {
                    try {
                        try {
                            ResourceCodec.m2167d(inputStreamOpen2, new File(str3), mapM2165a);
                        } catch (IOException e4) {
                            Log.e("ResourceBaseHelper", "decompressAsset: ", e4);
                        }
                    } finally {
                        try {
                            inputStreamOpen2.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            } catch (IOException e6) {
                Log.e("ResourceBaseHelper", "decompressAsset: ", e6);
            }
        } catch (IOException e7) {
            Log.e("ResourceBaseHelper", "decompressAsset: ", e7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2164b(String str, String str2, String str3) {
        if (new File(outline.m1600v(str3, "/", str2)).exists()) {
            Log.d("ResourceBaseHelper", "decompressFile: directory " + str2 + "is existed!");
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            Map<String, ArrayList<ResourceCodec.b>> mapM2165a = null;
            try {
                try {
                    mapM2165a = ResourceCodec.m2165a(fileInputStream);
                } catch (IOException e) {
                    Log.e("ResourceBaseHelper", "decompressFile: ", e);
                }
                try {
                    fileInputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                if (mapM2165a == null) {
                    return;
                }
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(str);
                    try {
                        try {
                            ResourceCodec.m2167d(fileInputStream2, new File(str3), mapM2165a);
                        } catch (IOException e3) {
                            Log.e("ResourceBaseHelper", "decompressFile: ", e3);
                        }
                    } finally {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                } catch (IOException e5) {
                    Log.e("ResourceBaseHelper", "decompressFile: ", e5);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                throw th;
            }
        } catch (IOException e7) {
            Log.e("ResourceBaseHelper", "decompressFile: ", e7);
        }
    }
}
