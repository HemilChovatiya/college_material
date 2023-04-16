import numpy as np

quantization_matrix = np.array(
    [
        [16, 11, 10, 16, 24, 40, 51, 61],
        [12, 12, 14, 19, 26, 58, 60, 55],
        [14, 13, 16, 24, 40, 57, 69, 56],
        [14, 17, 22, 29, 51, 87, 80, 62],
        [18, 22, 37, 56, 68, 109, 103, 77],
        [24, 35, 55, 64, 81, 104, 113, 92],
        [49, 64, 78, 87, 103, 121, 120, 101],
        [72, 92, 95, 98, 112, 100, 103, 99],
    ]
)


def jpeg_compress(block):
    shifted_block = block - 128
    dct_block = shifted_block
    quantized_block = np.round(dct_block / quantization_matrix)
    quantized_block = quantized_block.flatten()
    return quantized_block


def jpeg_decompress(quantized_block):
    quantized_block = quantized_block.reshape((8, 8))
    dequantized_block = quantized_block * quantization_matrix
    idct_block = dequantized_block
    reconstructed_block = np.clip(idct_block + 128, 0, 255).astype(np.uint8)
    return reconstructed_block


def random_8x8():
    return np.random.randint(0, 256, size=(8, 8)).astype(np.uint8)


matrix = random_8x8()
print("Original Matrix:")
print(matrix)
compressed_matrix = jpeg_compress(matrix)
print("\nCompressed Matrix:")
print(compressed_matrix)
decompressed_matrix = jpeg_decompress(compressed_matrix)
print("\nDecompressed Matrix:")
print(decompressed_matrix)
