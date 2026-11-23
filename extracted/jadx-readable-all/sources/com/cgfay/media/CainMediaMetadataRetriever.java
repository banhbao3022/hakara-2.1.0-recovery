package com.cgfay.media;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p147g.p150c.BitmapUtils;

/* JADX INFO: loaded from: classes.dex */
public class CainMediaMetadataRetriever {
    private static final int EMBEDDED_PICTURE_TYPE_ANY = 65535;
    public static final String METADATA_KEY_ALBUM = "album";
    public static final String METADATA_KEY_ALBUMARTIST = "album_artist";
    public static final String METADATA_KEY_ARTIST = "artist";
    public static final String METADATA_KEY_AUDIO_CODEC = "audio_codec";
    public static final String METADATA_KEY_BITRATE = "bitrate";
    public static final String METADATA_KEY_CHAPTER_COUNT = "chapter_count";
    public static final String METADATA_KEY_CHAPTER_END = "chapter_end";
    public static final String METADATA_KEY_CHAPTER_START = "chapter_start";
    public static final String METADATA_KEY_COMMENT = "comment";
    public static final String METADATA_KEY_COMPOSER = "composer";
    public static final String METADATA_KEY_COPYRIGHT = "copyright";
    public static final String METADATA_KEY_CREATION_TIME = "creation_time";
    public static final String METADATA_KEY_DATE = "date";
    public static final String METADATA_KEY_DESCRIPTION = "description";
    public static final String METADATA_KEY_DISC_NUMBER = "disc";
    public static final String METADATA_KEY_DURATION = "duration";
    public static final String METADATA_KEY_ENCODED_BY = "encoded_by";
    public static final String METADATA_KEY_ENCODER = "encoder";
    public static final String METADATA_KEY_FILENAME = "filename";
    public static final String METADATA_KEY_FILE_SIZE = "file_size";
    public static final String METADATA_KEY_FRAME_RATE = "frame_rate";
    public static final String METADATA_KEY_GENRE = "genre";
    public static final String METADATA_KEY_ICY_METADATA = "icy_metadata";
    public static final String METADATA_KEY_LANGUAGE = "language";
    public static final String METADATA_KEY_PERFORMER = "performer";
    public static final String METADATA_KEY_PUBLISHER = "publisher";
    public static final String METADATA_KEY_ROTAE = "rotate";
    public static final String METADATA_KEY_SERVICE_NAME = "service_name";
    public static final String METADATA_KEY_SERVICE_PROVIDER = "service_provider";
    public static final String METADATA_KEY_TITLE = "title";
    public static final String METADATA_KEY_TRACK = "track";
    public static final String METADATA_KEY_VIDEO_CODEC = "video_codec";
    public static final String METADATA_KEY_VIDEO_HEIGHT = "video_height";
    public static final String METADATA_KEY_VIDEO_WIDTH = "video_width";
    public static final String METADATA_KEY_YEAR = "year";
    public static final int OPTION_CLOSEST = 3;
    public static final int OPTION_CLOSEST_SYNC = 2;
    public static final int OPTION_NEXT_SYNC = 1;
    public static final int OPTION_PREVIOUS_SYNC = 0;
    private long mNativeContext;

    static {
        System.loadLibrary("ffmpeg");
        System.loadLibrary("metadata_retriever");
        native_init();
    }

    public CainMediaMetadataRetriever() {
        native_setup();
    }

    private native HashMap<String, String> _getAllMetadata();

    private native byte[] _getFrameAtTime(long j2, int i);

    private native byte[] _getScaledFrameAtTime(long j2, int i, int i2, int i3);

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IllegalArgumentException;

    private native byte[] getEmbeddedPicture(int i);

    private final native void native_finalize();

    private static native void native_init();

    private native void native_setup();

    public native String extractMetadata(String str);

    public native String extractMetadataFromChapter(String str, int i);

    public void finalize() throws Throwable {
        try {
            native_finalize();
        } finally {
            super.finalize();
        }
    }

    public byte[] getEmbeddedPicture() {
        return getEmbeddedPicture(EMBEDDED_PICTURE_TYPE_ANY);
    }

    public Bitmap getFrameAtTime(long j2, int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException(outline.m1590l("Unsupported option: ", i));
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        byte[] bArr_getFrameAtTime = _getFrameAtTime(j2, i);
        if (bArr_getFrameAtTime != null) {
            return BitmapFactory.decodeByteArray(bArr_getFrameAtTime, 0, bArr_getFrameAtTime.length, options);
        }
        return null;
    }

    public CainMetadata getMetadata() {
        HashMap<String, String> map_getAllMetadata = _getAllMetadata();
        if (map_getAllMetadata != null) {
            return new CainMetadata(map_getAllMetadata);
        }
        return null;
    }

    public Bitmap getScaledFrameAtTime(long j2, int i, int i2, int i3) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException(outline.m1590l("Unsupported option: ", i));
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        int iIntValue = Integer.valueOf(extractMetadata(METADATA_KEY_ROTAE)).intValue();
        byte[] bArr_getScaledFrameAtTime = _getScaledFrameAtTime(j2, i, i2, i3);
        if (bArr_getScaledFrameAtTime != null) {
            return iIntValue % 90 != 0 ? BitmapUtils.m2220b(bArr_getScaledFrameAtTime, iIntValue) : BitmapFactory.decodeByteArray(bArr_getScaledFrameAtTime, 0, bArr_getScaledFrameAtTime.length, options);
        }
        return null;
    }

    public native void release();

    public native void setDataSource(FileDescriptor fileDescriptor, long j2, long j3) throws IllegalArgumentException;

    public native void setDataSource(String str) throws IllegalArgumentException;

    public void setDataSource(String str, Map<String, String> map) throws IllegalArgumentException {
        String[] strArr = new String[map.size()];
        String[] strArr2 = new String[map.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i] = entry.getKey();
            strArr2[i] = entry.getValue();
            i++;
        }
        _setDataSource(str, strArr, strArr2);
    }

    public Bitmap getFrameAtTime(long j2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        byte[] bArr_getFrameAtTime = _getFrameAtTime(j2, 2);
        if (bArr_getFrameAtTime != null) {
            return BitmapFactory.decodeByteArray(bArr_getFrameAtTime, 0, bArr_getFrameAtTime.length, options);
        }
        return null;
    }

    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalArgumentException {
        setDataSource(fileDescriptor, 0L, 576460752303423487L);
    }

    public void setDataSource(Context context, Uri uri) throws SecurityException, IllegalArgumentException {
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null && !scheme.equals("file")) {
                AssetFileDescriptor assetFileDescriptor = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                            FileDescriptor fileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor();
                            if (fileDescriptor.valid()) {
                                if (assetFileDescriptorOpenAssetFileDescriptor.getDeclaredLength() < 0) {
                                    setDataSource(fileDescriptor);
                                } else {
                                    setDataSource(fileDescriptor, assetFileDescriptorOpenAssetFileDescriptor.getStartOffset(), assetFileDescriptorOpenAssetFileDescriptor.getDeclaredLength());
                                }
                                try {
                                    assetFileDescriptorOpenAssetFileDescriptor.close();
                                    return;
                                } catch (IOException unused) {
                                    return;
                                }
                            }
                            throw new IllegalArgumentException();
                        }
                        throw new IllegalArgumentException();
                    } catch (FileNotFoundException unused2) {
                        throw new IllegalArgumentException();
                    }
                } catch (SecurityException unused3) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused4) {
                        }
                    }
                    setDataSource(uri.toString());
                    return;
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw th;
                }
            }
            setDataSource(uri.getPath());
            return;
        }
        throw new IllegalArgumentException();
    }

    public Bitmap getScaledFrameAtTime(long j2, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        int iIntValue = Integer.valueOf(extractMetadata(METADATA_KEY_ROTAE)).intValue();
        byte[] bArr_getScaledFrameAtTime = _getScaledFrameAtTime(j2, 2, i, i2);
        if (bArr_getScaledFrameAtTime == null) {
            return null;
        }
        if (iIntValue != 0) {
            return BitmapUtils.m2220b(bArr_getScaledFrameAtTime, iIntValue);
        }
        return BitmapFactory.decodeByteArray(bArr_getScaledFrameAtTime, 0, bArr_getScaledFrameAtTime.length, options);
    }

    public Bitmap getFrameAtTime() {
        return getFrameAtTime(-1L, 2);
    }
}
